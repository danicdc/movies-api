package com.apidemo.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="imdb_top_1000")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    // define fields

    @Column(name="Poster_Link")
    private String posterLink;

    @Column(name="Series_Title")
    private String title;

    @Column(name="Released_Year")
    private int releasedYear;

    @Column(name="Certificate")
    private String certificate;

    @Column(name="Runtime")
    private String runtime;

    @Column(name="Genre")
    private String genre;

    @Column(name="IMDB_Rating")
    private double imdbRating;

    @Column(name="Overview")
    private String overview;

    @Column(name="Meta_score")
    private int metaScore;

    @Column(name="Director")
    private String director;

    @Column(name="Star1")
    private String star1;

    @Column(name="Star2")
    private String star2;

    @Column(name="Star3")
    private String star3;

    @Column(name="Star4")
    private String star4;

    @Column(name="No_of_votes")
    private int noOfVotes;

    @Column(name="Gross")
    private String gross;



    // define constructors
    public Movie() {

    }

    public Movie(String posterLink, String title, int releasedYear, String certificate, String runtime, String genre,
                 double imdbRating, String overview, int metaScore, String director, String star1,
                 String star2, String star3, String star4) {
        this.posterLink = posterLink;
        this.title = title;
        this.releasedYear = releasedYear;
        this.certificate = certificate;
        this.runtime = runtime;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.overview = overview;
        this.metaScore = metaScore;
        this.director = director;
        this.star1 = star1;
        this.star2 = star2;
        this.star3 = star3;
        this.star4 = star4;
    }

    public String getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(int metaScore) {
        this.metaScore = metaScore;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar1() {
        return star1;
    }

    public void setStar1(String star1) {
        this.star1 = star1;
    }

    public String getStar2() {
        return star2;
    }

    public void setStar2(String star2) {
        this.star2 = star2;
    }

    public String getStar3() {
        return star3;
    }

    public void setStar3(String star3) {
        this.star3 = star3;
    }

    public String getStar4() {
        return star4;
    }

    public void setStar4(String star4) {
        this.star4 = star4;
    }

    public int getNoOfVotes() {
        return noOfVotes;
    }

    public void setNoOfVotes(int noOfVotes) {
        this.noOfVotes = noOfVotes;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", posterLink='" + posterLink + '\'' +
                ", title='" + title + '\'' +
                ", releasedYear=" + releasedYear +
                ", certificate='" + certificate + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                ", overview='" + overview + '\'' +
                ", metaScore=" + metaScore +
                ", director='" + director + '\'' +
                ", star1='" + star1 + '\'' +
                ", star2='" + star2 + '\'' +
                ", star3='" + star3 + '\'' +
                ", star4='" + star4 + '\'' +
                ", noOfVotes=" + noOfVotes +
                ", gross='" + gross + '\'' +
                '}';
    }
}








