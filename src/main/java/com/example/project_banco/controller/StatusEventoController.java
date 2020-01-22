package com.example.project_banco.controller;

import java.util.List;
import javax.validation.Valid;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.project_banco.domain.dto.request.StatusEventoRequest;
import com.example.project_banco.domain.dto.response.StatusEventoResponse;
import com.example.project_banco.service.StatusEventoService;
import com.example.project_banco.domain.entities.StatusEvento;
import com.example.project_banco.domain.mapper.StatusEventoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StatusEvento")
public class StatusEventoController {

	private final StatusEventoService statuseventoService;
	private final StatusEventoMapper mapper;

	@Autowired
	public StatusEventoController(StatusEventoService statuseventoService, StatusEventoMapper statuseventoMapper) {
		this.statuseventoService = statuseventoService;
		this.mapper = statuseventoMapper;
	}
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<StatusEventoResponse> getById(@PathVariable Integer IdEventoStatus) {
         return ResponseEntity.ok(mapper.toDto(statuseventoService.findById(IdEventoStatus))) ;
    }
    
	@GetMapping
	public ResponseEntity<List<StatusEventoResponse>> list() {
		return ResponseEntity.ok(statuseventoService.listStatusEvento().stream() //
				.map(x -> mapper.toDto(x)) //
				.collect(Collectors.toList()));
	}

	// @GetMapping(value = "/distinct")
	// public ResponseEntity<List<String>> listDistinct() {
	// 	return ResponseEntity.ok(statuseventoService.listDistinct());
	// }

	// @PostMapping
	// public ResponseEntity<StatusEventoResponse> post(@Valid @RequestBody StatusEventoRequest model) {
	// 	StatusEvento statusevento = statuseventoService.createStatusEvento(mapper.fromDto(model));
	// 	return ResponseEntity.ok(mapper.toDto(statusevento));
	// }

	// @PutMapping(value = "/{id}")
	// public ResponseEntity<StatusEventoResponse> update(@PathVariable Integer IdEventoStatus, @Valid @RequestBody StatusEventoRequest model){
	// 	StatusEvento statusevento = mapper.fromDto(model);
	// 	statusevento.setIdEventoStatus(IdEventoStatus);
	// 	statuseventoService.update(statusevento);

	// 	return ResponseEntity.ok(mapper.toDto(statusevento));
	// }

	// @DeleteMapping(value = "/{id}")
    // public void deleteById(@PathVariable Integer IdEventoStatus) {

	// 	statuseventoService.delete(IdEventoStatus);

	// }

}