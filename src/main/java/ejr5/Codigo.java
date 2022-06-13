package ejr5;

public class Codigo {
    private String liniasCodigo;
    private String comments;
    private boolean isStoryComplete;

    public Codigo(String liniasCodigo, String comments, boolean isStoryComplete){
        this.liniasCodigo=liniasCodigo;
        this.comments=comments;
        this.isStoryComplete=isStoryComplete;
    }

    public String getLiniasCodigo() {
        return liniasCodigo;
    }

    public void setLiniasCodigo(String liniasCodigo) {
        this.liniasCodigo = liniasCodigo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isStoryComplete() {
        return isStoryComplete;
    }

    public void setStoryComplete(boolean storyComplete) {
        isStoryComplete = storyComplete;
    }

    public void showInfo() {
        System.out.println("liniasCodigo: "+liniasCodigo);
        System.out.println("comments: "+comments);
        System.out.println("isStoryComplete: "+isStoryComplete);

    }
}