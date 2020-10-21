public class Mentor {
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor,PartTimeMentor partTimeMentor){
        this.fullTimeMentor=fullTimeMentor;
        this.partTimeMentor=partTimeMentor;
    }
    public void mangeAccount(){
        fullTimeMentor.CreateAccount();
        partTimeMentor.createAccount();
    }

}
