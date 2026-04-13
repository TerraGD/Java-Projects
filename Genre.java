class Genre {
    private String genreName;
    private String description;
    
    public String getgenreName() {
        return description;
    }
    public void setgenreName(String genreName){
        if(genreName != null){
            this.genreName = genreName;
        } 
    }
    ////
    ////
    public String getdescription() {
        return description;
    }
    public void setdescription(String description){
        if(description != null){
            this.description = description;
        } 
    }
    ////
    ////
    
    void display(String genreName, String description){
        this.genreName = genreName;
        this.description = description;
    }
    
    public String toString(){
        return (genreName + " - " + description);
    }
    
    public boolean equals(MediaContent that){
        return (this.genreName  == that.genreName);
    } 
}
