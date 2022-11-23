package AssignmentOne;

/**
 * A class that gets 3 LineItem objects and turns them into an Invoice
 *<pre>
 * Create a class call Invoice that has three instance variables of type LineItem (Although it’s bad practice,
 * you can name them lineItem1, lineItem2 and lineItem3). You will have to create blank line items to avoid
 * null values – to do this create a lineItem with no quantity so the total is zero. Add methods to set and
 * get the LineItem – use setLineItem(int line, LineItem lineItem). Add a method to get the invoice total
 * (note: it should be the same as the LineItem total) which should be the sum of the lineItem totals. Add
 * these tests to the InvoiceTester class.
 *</pre>
 *
 *  * @author 20168209
 */
public class Invoice {
    private LineItem lineItem1;
    private LineItem lineItem2;
    private LineItem lineItem3;

    /**
     * Creates The invoice
     * @param lineItem1 -LineItem, gets LineItem1
     * @param lineItem2 - LineItem, gets LineItem2
     * @param lineItem3 - LineItem, gets LineItem3
     */
    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3) {
        this.lineItem1 = lineItem1;
        this.lineItem2 = lineItem2;
        this.lineItem3 = lineItem3;
    }

    /**
     * Use Param to get the specific LineItem and return that LineItem
     *
     * @param line
     * @return LineItem(line)
     */
    public LineItem getLineItem(int line) {
        if(line == 1){
            return this.lineItem1;
        } else if(line == 2) {
            return this.lineItem2;
        } else if(line == 3) {
            return this.lineItem3;
        } else {
            return lineItem1;
        }
    }

    /**
     * Use Params to set specific lineitem by using the Line to get the right LineItem
     *
     * @param line
     * @param lineItem
     * @return LineItem
     */
    public LineItem setLineItem(int line, LineItem lineItem) {
        if(line == 1){
            this.lineItem1 = lineItem;
        } else if(line == 2) {
            this.lineItem2 = lineItem;
        } else if(line == 3) {
            this.lineItem3 = lineItem;
        }
        return lineItem;
    }

    /**
     * Get the total of the LineItems all added together
     *
     * @return LineItem1(Total) + LineItem2(Total) + LineItem3(Total)
     */
    public Double getInvoiceTotal(){
        return lineItem1.getTotal() + lineItem2.getTotal() + lineItem3.getTotal();
    }
}
