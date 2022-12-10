package com.InsuranceProject.entities.concretes.Insruances;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.InsuranceProject.entities.abstracts.Insurances;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CarObject"}) //Bir veriyi birden fazla defa yazdırıp sonsuz döngüye girmesini engellemek için yazıldı.
@Table(name="dask")
public class Dask extends Insurances {

	@Column(name="structure_id")
	public int structureId;
	
	@Column(name="structure_category")
	public String structureCategory;
	
	@Column(name ="construction_date")
	public Date constructionDate;
	
	@Column(name="flat_number")
	public int flatNumber;
	
	@Column(name="flat_size")
	public int flatSize;
	
	public Dask(){
		
	}

	public int getStructureId() {
		return structureId;
	}

	public void setStructureId(int structureId) {
		this.structureId = structureId;
	}

	public String getStructureCategory() {
		return structureCategory;
	}

	public void setStructureCategory(String structureCategory) {
		this.structureCategory = structureCategory;
	}

	public Date getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(Date constructionDate) {
		this.constructionDate = constructionDate;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getFlatSize() {
		return flatSize;
	}

	public void setFlatSize(int flatSize) {
		this.flatSize = flatSize;
	}

}
