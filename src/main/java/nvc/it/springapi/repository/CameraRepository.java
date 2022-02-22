package nvc.it.springapi.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.springapi.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String>{
    public List<Camera> findByNameContaining(String name);
}
