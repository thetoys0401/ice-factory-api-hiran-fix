package nvc.it.springapi.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.it.springapi.model.Camera;
import nvc.it.springapi.model.Event;
import nvc.it.springapi.service.CameraService;

@RestController
@RequestMapping("/camera")
public class CameraController {
    
    @Autowired
    private CameraService cameraService;

    @GetMapping("")
    public ResponseEntity<Object> getAllCamera(){
        List<Camera> cameras = cameraService.getCameras();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success!");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getCameraById(@PathVariable String id){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search By Id Success!");
        map.put("data", cameraService.findById(id));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Object> addProduct(@RequestBody Camera camera){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Success!");
        map.put("data", cameraService.addCamera(camera));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> addEvent(@PathVariable String id, @RequestBody Event event){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Event Success!");
        map.put("data", cameraService.addEvent(id, event));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
    

