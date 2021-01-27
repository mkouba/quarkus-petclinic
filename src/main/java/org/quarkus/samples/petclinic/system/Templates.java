package org.quarkus.samples.petclinic.system;

import java.util.Collection;
import java.util.List;

import org.quarkus.samples.petclinic.owner.Owner;
import org.quarkus.samples.petclinic.owner.Pet;
import org.quarkus.samples.petclinic.owner.PetType;
import org.quarkus.samples.petclinic.vet.Vet;
import org.quarkus.samples.petclinic.visit.Visit;

import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.CheckedTemplate;

@CheckedTemplate
public class Templates {
    public static native TemplateInstance welcome();
    public static native TemplateInstance vetList(List<Vet> vets);

    public static native TemplateInstance findOwners(List<String> errors);

    public static native TemplateInstance ownerDetails(Owner owner);

    public static native TemplateInstance createOrUpdateOwnerForm(Owner owner);

    public static native TemplateInstance ownersList(Collection<Owner> owners);

    public static native TemplateInstance createOrUpdatePetForm(Owner owner, Pet pet, List<PetType> petTypes);

    public static native TemplateInstance createOrUpdateVisitForm(Pet pet, Visit visit);
}