package br.com.marcos.model;

import br.com.marcos.contract.Browser;

public class FireFoxBrowser implements Browser {

    private String version;

    public FireFoxBrowser() {

    }

    public FireFoxBrowser(String version) {
        setVersion(version);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean newPage() {
        System.out.println("Opening a new page.");
        return true;
    }

    @Override
    public boolean showPage() {
        System.out.println("Showing page");
        return true;
    }

    @Override
    public boolean reloadPage() {
        System.out.println("Reloading page");
        return true;
    }
}
