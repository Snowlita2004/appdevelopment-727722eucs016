
package com.example.backend.models;

public class FooterInfo {
    private String copyright;
    private String foundedByLink;
    private String foundedByText;

    // Constructors, Getters, and Setters
    public FooterInfo(String copyright, String foundedByLink, String foundedByText) {
        this.copyright = copyright;
        this.foundedByLink = foundedByLink;
        this.foundedByText = foundedByText;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getFoundedByLink() {
        return foundedByLink;
    }

    public void setFoundedByLink(String foundedByLink) {
        this.foundedByLink = foundedByLink;
    }

    public String getFoundedByText() {
        return foundedByText;
    }

    public void setFoundedByText(String foundedByText) {
        this.foundedByText = foundedByText;
    }
}