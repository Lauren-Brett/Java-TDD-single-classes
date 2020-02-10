public class Printer {

    private Integer paper;



    public Printer() {
        this.paper = 20;
    }

    public Integer paperInPrinter() {
        return this.paper;
    }

    public boolean enough_paper(Integer numPages, Integer numCopies) {
        if (this.paper >= numPages * numCopies) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer print_out(Integer numPages, Integer numCopies) {
       Integer totalPagesToPrintNeeded = numPages * numCopies;
//
            if (totalPagesToPrintNeeded <= this.paper) {
                this.paper = totalPagesToPrintNeeded - this.paper;
//
            }
        return totalPagesToPrintNeeded;
    }

    // reduce value of paper //
    // printout ( numP, numC )
    // sum of numP * numC = totalToPrintPaperNeeded
    // if totalToPrint < this.paper is true
    // this.paper - totalToPrintPaperNeeded is now paper
    // return totalToPrintPaperNeeded


}

