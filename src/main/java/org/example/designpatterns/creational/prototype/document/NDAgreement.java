package org.example.designpatterns.creational.prototype.document;
//non-disclosure agreements the vendor must accept before commencing work
/*
The content of the agreements remains same for all vendors and an HR employee only needs to fill in the vendor name before sending an agreement to the vendor.
 Assuming that the agreement content are stored in a remote database,
 you can apply the prototype pattern to avoid making a network trip and a database read each time the HR employee needs to create an agreement.
 */
public class NDAgreement extends PrototypeCapableDocument {
    private AuthorizedSignatory authorizedSignatory;
    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }
    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }
    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /*Clone with deep copy*/
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }
    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}
