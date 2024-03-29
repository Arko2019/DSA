package synchronize.functionality;

public class SynchronizedExchanger {
    public  Object object=null;
    public synchronized void setObject(Object o){
        this.object=o;
    }
    public synchronized Object getObject(){
        return this.object;
    }
    public  void setObj(Object o){
        synchronized (this){
            this.object=o;
        }
    }
    public Object getObj(){
        synchronized (this){
            return this.object;
        }
    }
}
