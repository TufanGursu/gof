package org.example.designpatterns.structural.adapter.textformat;

public class CsvFormatter implements CsvFormattable{
    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",";");
        return formattedText;
    }
}
