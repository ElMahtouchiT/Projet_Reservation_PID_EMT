package be.iccbxl.pid.projet_reservation_pid_emt.service;

import be.iccbxl.pid.projet_reservation_pid_emt.model.Artist;
import be.iccbxl.pid.projet_reservation_pid_emt.repository.ArtistRepository;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class ArtistService implements I_ArtistService{

    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        List<Artist> artists = new ArrayList<>();
        artistRepository.findAll().forEach(artists::add);
        return artists;
    }

    public Artist getArtist(String indice) {
        long id = Long.parseLong(indice);
        return artistRepository.findById(id);
    }

    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }

    public void updateArtist(long id, Artist artist) {
        artistRepository.save(artist);
    }

    public void deleteArtist(String indice) {
        long id = Long.parseLong(indice);
        artistRepository.deleteById(id);
    }

}
