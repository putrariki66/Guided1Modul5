/**kelas ChildCD merupakan turunan dari CD dan
 mengimplementasikan interface InterfaceCD*/
class ChildCD extends CD implements InterfaceCD
{
    public ChildCD(String ukuran,long hargaCD)
    {
        super(ukuran,hargaCD);
    }
}