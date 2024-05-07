package lelang;
import java.util.ArrayList;
public class Masyarakat implements User {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
 
    public Masyarakat() {
        this.namaMasyarakat.add("Agus");
        this.alamat.add("Malang");
        this.telepon.add("08123456666");

        this.namaMasyarakat.add("SLamet ");
        this.alamat.add("Sumawe");
        this.telepon.add("081222233344");
        
        this.namaMasyarakat.add("Nor");
        this.alamat.add("Sumenep");
        this.telepon.add("0810323792281");
        
       
        
    } 
    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    } 
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat){
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat){
        return this.telepon.get(idMasyarakat);
    } 

    
}