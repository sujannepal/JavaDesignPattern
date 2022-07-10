package observerpattern;

import java.util.ArrayList;

public class PostOffice implements Subject {
    private ArrayList<Mail> mailList;
    private  ArrayList<Observer> observers;

    public PostOffice(){
        mailList = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMail(Mail mailToAdd){
        mailList.add(mailToAdd);
        Notify();
    }

    public ArrayList<Mail> getState(){
        return mailList;
    }

    public void Attach(Observer o){
        observers.add(o);
    }
    public void Detach(Observer o){
        observers.remove(0);
    }
    public void Notify(){
        for(int i=0; i<observers.size(); i++){
            observers.get(i).Update(this);
        }

    }
}
