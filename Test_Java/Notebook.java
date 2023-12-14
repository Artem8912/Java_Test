package Test_Java;
    
// import Notebooks;
// packHD_Volume Notebooks;

// import Notebooks.Notebook;

public class Notebook {
    private String model;
    private String RAM_Volume;
    private String HD_Volume;
    private String Colour;
    private String Price;
    private String Frequency_process;

    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getRAM_Volume() {
        return RAM_Volume;
    }

    public void setRAM_Volume(String RAM_Volume) {
        this.RAM_Volume = RAM_Volume;
    }

    public String getHD_Volume() {
        return HD_Volume;
    }

    public void setHD_Volume(String HD_Volume) {
        this.HD_Volume = HD_Volume;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getPrice(){
        return Price;
    }
    public void setPrice(String Price ){
            this.Price = Price;
    }
     public String getFrequency_process(){
        return Frequency_process;
    }
    public void setFrequency_process(String Frequency_process ){
            this.Frequency_process = Frequency_process;
    }

    @Override
    public String toString() {
        return "model: " + model + ", HD_Volume: " + HD_Volume + " GB" + ", RAM_Volume: " + RAM_Volume + " GB" + ", Frequency_process: "+ Frequency_process + " GHz "+ ", Colour: " + Colour+  ", Price: " + Price + " $";
    
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Notebook){
            Notebook Notebook = (Notebook) obj;
            return model.equals(Notebook.model) && HD_Volume.equals(Notebook.HD_Volume) && RAM_Volume.equals(Notebook.RAM_Volume) && Frequency_process.equals(Notebook.Frequency_process)&& Colour.equals(Notebook.Colour)&& Price.equals(Notebook.Price);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return model.hashCode()+ HD_Volume.hashCode() + RAM_Volume.hashCode()+Frequency_process.hashCode()+Colour.hashCode()+Price.hashCode();
    }
    
}
