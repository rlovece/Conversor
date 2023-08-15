package org.conversor.models;

public enum Monedas {
        BOLIVAR_VENEZOLANO("Bolívar Venezolano", 32744.357142857),
        CORONA_CHECA("Corona Checa", 22.052193573215),
        CORONA_DANESA("Corona Danesa", 6.831754878803),
        CORONA_NORUEGA("Corona Noruega", 10.479631492319),
        CORONA_SUECA("Corona Sueca", 10.800353398516),
        DINAR_KUWAIT("Dinar Kuwait", 0.30769215280001),
        DIRHAM_EMIATOS("Dirham Emiratos", 3.6725095133186),
        DOLAR_AUSTRALIANO("Dólar Australiano", 1.540651991262),
        DOLAR_CANADIENSE("Dólar Canadiense", 1.345923878338),
        DOLAR_HONG_KONG("Dólar Hong Kong", 7.8183477163421),
        DOLAR_NEOZELANDES("Dólar Neozelandés", 1.6734205170793),
        DOLAR_SINGAPUR("Dólar Singapur", 1.3554590653261),
        EURO("Euro", 0.916842),
        FLORIN_HUNGARO("Florín Húngaro", 352.22512485594),
        FRANCO_SUIZO("Franco Suizo", 0.87833491882384),
        LIBRA("Libra", 0.78827443899923),
        LIRA_TURCA("Lira Turca", 27.037511058685),
        LITAS_LITUANO("Litas Lituano", 2.9339976767182),
        PESO_ARGENTINO("Peso Argentino", 349.93969465649),
        PESO_CHILENO("Peso Chileno", 860.07692307692),
        PESO_COLOMBIANO("Peso Colombiano", 4038.9515418502),
        PESO_MEXICANO("Peso Mexicano", 17.056890906385),
        PESO_URUGUAYO("Peso Uruguayo", 38.14929471976),
        RAND_SUDAFRICANO("Rand Sudafricano", 19.073060120657),
        REAL_BRASILENO("Real Brasileño", 4.9661571461071),
        RIAL_SAUDI("Rial Saudí", 3.7514453941742),
        RINGGIT_MALASIO("Ringgit Malasio", 4.6172231454903),
        RUBLO_RUSO("Rublo Ruso", 96.99978840457),
        RUPIA_INDIA("Rupia India", 83.198003629764),
        SHEKEL_ISRAELI("Shekel Israelí", 3.6864935284255),
        YEN("Yen", 145.50737978099),
        YUAN("Yuan", 7.2622298967112),
        ZLOTY_POLACO("Zloty Polaco", 4.0776623896462);

        private final String nombre;
        private final double tasaDeCambioDolar;

    Monedas(String nombre, double tasaDeCambioDolar) {
        this.nombre = nombre;
        this.tasaDeCambioDolar = tasaDeCambioDolar;
    }

    ///region Getters

    public String getNombre() {
        return nombre;
    }

    public double getTasaDeCambioDolar() {
        return tasaDeCambioDolar;
    }

    ///endregion

    @Override
    public String toString() {
        return nombre;
    }
}
