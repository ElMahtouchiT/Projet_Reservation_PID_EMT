package be.iccbxl.pid.projet_reservation_pid_emt.service;

import be.iccbxl.pid.projet_reservation_pid_emt.model.Artist;

import java.util.List;

public interface I_ArtistService  {
    List<Artist> getAllArtists();
    Artist getArtist(String id);
    void addArtist(Artist artist);
    void updateArtist(long id, Artist artist);
    void deleteArtist(String indice);
}
