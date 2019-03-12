import java.util.List;

public class Doctor
  extends Person
{
  public String idParaf;
  public List<Pacient> pacients;
  public String doctorId;
  public List<Assistant> assistants;
  public RecommendAlgorithm myRecommendAlgorithm;
  
  public void sentRecommandation() {}
  
  public void insertTreatment(Pacient paramPacient) {}
  
  public void modifyTreatMent(Pacient paramPacient) {}
  
  public void deleteTreatment(Pacient paramPacient) {}
  
  public void showStats() {}
  
  public void querryAlgo(RecommendAlgorithm paramRecommendAlgorithm, Pacient paramPacient) {}
}


/* Location:              D:\School\anul_II\ip\reverseLab4\!\Doctor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */