package monitoramento_hidrologico_e_ambiental;

public enum NivelReservatorio {
    NORMAL("Normal", 
            "Volumes acima de 60%. Consumo consciente e monitoramento preventivo."),
    ATENCAO("Atenção",
            "Início da Gestão de Demanda Noturna (GDN)."),
    ALERTA("Alerta",
            "GDN ampliada e campanhas de conscientização."),
    RESTRICAO("Restrição",
            "Reservatórios abaixo da curva de segurança."),
    ESPECIAL("Especial",
            "Redução severa de pressão e priorização de serviços essenciais."),
    CRITICO("Crítico",
            "Rodízio de abastecimento e uso de caminhões-pipa.");

    private final String titulo;
    private final String descricao;

    NivelReservatorio(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
