package org.hl7.fhir.r5.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
    
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
 */



import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseHasExtensions;
import org.hl7.fhir.instance.model.api.IPrimitiveType;

import ca.uhn.fhir.model.api.IElement;

public abstract class PrimitiveType<T> extends DataType implements IPrimitiveType<T>, IBaseHasExtensions, IElement, Externalizable {

	private static final long serialVersionUID = 3L;

	private T myCoercedValue;
	private String myStringValue;

	public String asStringValue() {
		return myStringValue;
	}

	public abstract DataType copy();

	/**
	 * Subclasses must override to convert a "coerced" value into an encoded one.
	 * 
	 * @param theValue
	 *            Will not be null
	 * @return May return null if the value does not correspond to anything
	 */
	protected abstract String encode(T theValue);

	@Override
	public boolean equalsDeep(Base obj) {
		if (!super.equalsDeep(obj))
			return false;
		if (obj == null) {
			return false;
		}
		if (!(obj.getClass() == getClass())) {
			return false;
		}

		PrimitiveType<?> o = (PrimitiveType<?>) obj;

		EqualsBuilder b = new EqualsBuilder();
		b.append(getValue(), o.getValue());
		return b.isEquals();
	}

	@Override
	public boolean equalsShallow(Base obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj.getClass() == getClass())) {
			return false;
		}

		PrimitiveType<?> o = (PrimitiveType<?>) obj;

		EqualsBuilder b = new EqualsBuilder();
		b.append(getValue(), o.getValue());
		return b.isEquals();
	}

	public void fromStringValue(String theValue) {
		myStringValue = theValue;
		if (theValue == null) {
			myCoercedValue = null;
		} else {
			// NB this might be null
			myCoercedValue = parse(theValue);
		}
	}

	public T getValue() {
		return myCoercedValue;
	}

	public String getValueAsString() {
		return asStringValue();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getValue()).toHashCode();
	}

	public boolean hasValue() {
  	  return !StringUtils.isBlank(getValueAsString());
	}

  @Override
  public boolean isEmpty() {
    return super.isEmpty() && StringUtils.isBlank(getValueAsString());
  }

	public boolean isPrimitive() {
		return true;
	}

	/**
	 * Subclasses must override to convert an encoded representation of this datatype into a "coerced" one
	 * 
	 * @param theValue
	 *            Will not be null
	 * @return May return null if the value does not correspond to anything
	 */
	protected abstract T parse(String theValue);

	public String primitiveValue() {
		return asStringValue();
	}

	@Override
	public void readExternal(ObjectInput theIn) throws IOException, ClassNotFoundException {
		String object = (String) theIn.readObject();
		setValueAsString(object);
	}

	public PrimitiveType<T> setValue(T theValue) {
		myCoercedValue = theValue;
		updateStringValue();
		return this;
	}

	public void setValueAsString(String theValue) {
		fromStringValue(theValue);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + asStringValue() + "]";
	}

	protected DataType typedCopy() {
		return copy();
	}

	protected void updateStringValue() {
		if (myCoercedValue == null) {
			myStringValue = null;
		} else {
			// NB this might be null
			myStringValue = encode(myCoercedValue);
		}
	}

	@Override
	public void writeExternal(ObjectOutput theOut) throws IOException {
		theOut.writeObject(getValueAsString());
	}

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 111972721: // value
      setValueAsString(value.toString()); 
      return value;
    default: return super.setProperty(hash, name, value);
    }
  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("value"))
      setValueAsString(value.toString()); 
    else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("value"))
      setValueAsString(value.toString()); 
    else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    if (hash == 111972721) {
      return this; 
    } else
      return super.makeProperty(hash, name);

  }


  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    if (hash == 111972721) {
      Base[] b = new Base[1];
      b[0] = new StringType(getValueAsString());
      return b;
    } else
      return super.getProperty(hash, name, checkValid);
  }

  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    if (name.equals("value"))
      return new String[] {fhirType(), "string"}; 
    else
      return super.getTypesForProperty(hash, name);

  }

  /*
   * this is a workaround for representation issues with BigDecimal. So comments in DecimalType.
   * Yes, you can cut yourself with this method... 
   */
  protected void forceStringValue(String value) {
    myStringValue = value;
  }
  
  @Override
  public boolean hasPrimitiveValue() {
    return StringUtils.isNotBlank(getValueAsString());
  }

  public boolean canHavePrimitiveValue() {
    return true;
  }
  
  
  public String fpValue() {
    return primitiveValue();
  }
  
  public boolean matches(String other) {
    return other != null && other.equals(asStringValue());
  }
  
}