package ie.wit.models;

interface SheetStore {
    fun findAll() : List<SheetModel>
    fun findById(id: Long) : SheetModel?
    fun create(sheet: SheetModel)
    //fun update(donation: DonationModel)
    //fun delete(donation: DonationModel)
}