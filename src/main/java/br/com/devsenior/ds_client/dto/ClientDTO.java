package br.com.devsenior.ds_client.dto;

import java.time.LocalDate;

import br.com.devsenior.ds_client.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientDTO {
    
    private Long id;
    @Size(min = 3, max = 60, message = "O campo precisa ter entre 3 e 60 caracteres")
    @NotBlank(message = "O Campo nome é obrigatório")
    private String name;
    @Size(min = 11, max = 11, message = "O campo não pode ter menos que 11 caracteres")
    @NotBlank(message = "O Campo cpf é obrigatório")
    private String cpf;
    @Positive(message = "O Campo renda deve ser positivo")
    private Double income;
    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura")
    private LocalDate birthDate;
    private Integer children;


    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }

}
