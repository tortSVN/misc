package com.rest.API.controller;

import com.rest.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
	@Autowired
	UserRepository UserRepository;
//
//	@GetMapping("/contacts")
//	public List<Contact> getAllContacts() {
//		return ContactRepository.getAllContacts();
//	}
//	@GetMapping("/contacts/filter")
//	public List<Contact> getSomeContacts(@RequestParam(value="period", required=false) String period) {
//		return ContactRepository.getSomeContacts(period);
//	}
//
//	@PostMapping("/contacts")
//	public Contact createNote(@Valid @RequestBody Contact Contact) {
//		return ContactRepository.save(Contact);
//	}
//
//	@GetMapping("/contacts/{id}")
//	public Optional<Contact> getContactById(@PathVariable long id) {
//		return ContactRepository.findById(id);
//	}
//
//	@DeleteMapping("/contacts/delete/{id}")
//	public void deleteContact(@PathVariable long id) {
//		ContactRepository.deleteById(id);
//	}
//
//	@PutMapping("/contacts/edit/{id}")
//	public ResponseEntity<Object> updateStudent(@RequestBody Contact contact, @PathVariable long id) {
//		Optional<Contact> studentOptional = ContactRepository.findById(id);
//		if (!studentOptional.isPresent())
//			return ResponseEntity.notFound().build();
//		contact.setId(id);
//		ContactRepository.save(contact);
//		return ResponseEntity.noContent().build();
//	}
}