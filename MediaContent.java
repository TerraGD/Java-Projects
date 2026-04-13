class MediaContent {
    
    private String title;
    private int releaseYear;
    private char ageRating;
    private String description;
    private String genre;
    ////
    //// Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String model){
        if(title != null){
            this.title = title;
        } 
    }
    ////
    //// Release Year
    public int getreleaseYear() {
        return releaseYear;
    }
    public void setreleaseYear(int releaseYear){
        int currentYear = releaseYear;
        if(releaseYear > 0 && releaseYear <= (currentYear + 1)){
            this.releaseYear = releaseYear;
        }
    }
    ////
    //// Age Rating
    public char getageRating() {
        return ageRating;
    }
    public void setageRating(char ageRating){
        this.ageRating = ageRating;
    }
    ////
    //// Description
    public String getdescription() {
        return description;
    }
    public void setdescription(String description){
        if(description != null){
            this.description = description;
        } 
    }
    
    void display(String title ,int releaseYear ,char ageRating, String description){
        this.title = title;
        setreleaseYear(releaseYear);
        this.ageRating = ageRating;
        this.description = description;
    }
    
    void displayEX(String title ,int releaseYear ,char ageRating, String description, String genre){
        this.title = title;
        setreleaseYear(releaseYear);
        this.ageRating = ageRating;
        this.description = description;
        this.genre = genre;
    }
    
    public String toString(){
        return ("The " + title + " ("+ releaseYear +") " + "["+ ageRating +"] " +"\n" + description);
    }
    
    public boolean equals(MediaContent that){
        return (this.title  == that.title  && this.releaseYear == that.releaseYear);
    } 
    
    public static void main(String[] args){
        MediaContent mc1 = new MediaContent();
        MediaContent mc2 = mc1;
        mc1.display("Age Of Ultron", 2001, 'R', "Marvel Film Featuring Ultron.");
        System.out.println(mc1.toString());
        System.out.println(mc2.equals(mc1));
        
    }
    
