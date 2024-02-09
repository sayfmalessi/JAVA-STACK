package com.Dojo.example.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table (name="dojos")
public class Dojo {
	// MEMBER VARIABLES
			@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			
			@NotEmpty 
			@Size(min = 4, max = 100)
			private String Name;
			
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date createdAt;
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date updatedAt;
		    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
		    private List<Ninja> ninjas;
			public Dojo() {
				super();
			}
			//
			 @PrePersist
			    protected void onCreate(){
			        this.createdAt = new Date();
			    }
			    @PreUpdate
			    protected void onUpdate(){

			        this.updatedAt = new Date();
			    }
				public Long getId() {
					return id;
				}
				public void setId(Long id) {
					this.id = id;
				}
				public String getName() {
					return Name;
				}
				public void setName(String name) {
					Name = name;
				}
				public Date getCreatedAt() {
					return createdAt;
				}
				public void setCreatedAt(Date createdAt) {
					this.createdAt = createdAt;
				}
				public Date getUpdatedAt() {
					return updatedAt;
				}
				public void setUpdatedAt(Date updatedAt) {
					this.updatedAt = updatedAt;
				}
				public List<Ninja> getNinjas() {
					return ninjas;
				}

				public void setNinjas(List<Ninja> ninjas) {
					this.ninjas = ninjas;
				}
}
