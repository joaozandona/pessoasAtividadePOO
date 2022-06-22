import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa getById(int idPessoa){

        for(int x = 0; x < this.pessoas.size(); x++){
            if(this.pessoas.get(x).getId() == idPessoa){
                return this.pessoas.get(x);
            }
        }
        return null;
    }

    public List<Pessoa> getAll(){
        return this.pessoas;
    }

    public void add(String nome){
        int idAdicionado;
        int proxId;
        if (pessoas.isEmpty()) proxId = 1; else proxId = pessoas.get(pessoas.size() - 1).getId() + 1;

        Pessoa pessoa = new Pessoa();
        pessoa.setId(proxId);
        pessoa.setNome(nome);

        pessoas.add(pessoa);

    }
    public void delete(int idPessoa){

        int pessoaRemover = 0;

        for(int x = 0; x < this.pessoas.size(); x++){
            if(this.pessoas.get(x).getId() == idPessoa){
                pessoaRemover = x;
            }
        }

        pessoas.remove(pessoaRemover);
    }

}
