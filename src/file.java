public abstract class  file {
    String FileName;
    double CreationTime;
    String FileType;

    file(){
        this.FileName="Unknown";
        this.CreationTime=0.0;
        this.FileType="Unknown";
    }

    file(String FileName, double CreationTime){
        this.FileName=FileName;
        this.CreationTime=CreationTime;
    }

    public void set_CreationTime (Double CreationTime){
        this.CreationTime=CreationTime;
    }

    public Double get_CreationTime(){
        return CreationTime;
    }

    public abstract void OpenAndExecute();

}
