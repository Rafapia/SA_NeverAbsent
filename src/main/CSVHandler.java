package main;

import com.zavtech.morpheus.frame.DataFrame;

import java.io.File;

public class CSVHandler<R> {

    /* Fields */
    DataFrame<R, String> df;
    String filePath;


    /* Methods */
    public CSVHandler(String filePath) {

        // Store csv file path.
        this.filePath = filePath;

        // Read file and store in df.
        this.df = (DataFrame<R, String>) DataFrame.read().csv(new File(filePath));
    }


    public Object getCell(String category,  int occurence, String[][] specifiers) {

        Object cell = this.df.rows().select(row -> {
            for (String[] specification : specifiers) {
                if (!row.getValue(specification[0]).equals(specification[1])) {
                    return false;
                }
            }
            return true;
        }).col(category).getValue(occurence);

        return cell;
    }
    public Object getCell(String category, String[][] specifiers) {
        return this.getCell(category, 0, specifiers);
    }


}
