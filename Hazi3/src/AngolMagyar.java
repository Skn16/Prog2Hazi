/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class AngolMagyar {
    private String angol;
    private String magyar;

    public AngolMagyar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public void setAngol(String angol) {
        this.angol = angol;
    }

    public String getMagyar() {
        return magyar;
    }

    public void setMagyar(String magyar) {
        this.magyar = magyar;
    }

    @Override
    public String toString() {
        return "AngolMagyar{" + "angol=" + angol + ", magyar=" + magyar + '}';
    }
    
    
    
}
