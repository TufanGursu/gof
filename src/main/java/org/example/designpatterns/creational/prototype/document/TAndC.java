package org.example.designpatterns.creational.prototype.document;
//terms and conditions document
public class TAndC extends PrototypeCapableDocument {
    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*Clone with shallow copy*/
        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }
    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
