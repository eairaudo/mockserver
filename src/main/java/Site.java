public class Site {

    @Override
    public String toString() {
        return "{\n" +
                "  \"id\": \"MLA\",\n" +
                "  \"name\": \"Argentina\",\n" +
                "  \"country_id\": \"AR\",\n" +
                "  \"sale_fees_mode\": \"not_free\",\n" +
                "  \"mercadopago_version\": 3,\n" +
                "  \"default_currency_id\": \"ARS\",\n" +
                "  \"immediate_payment\": \"optional\",\n" +
                "  \"payment_method_ids\": [\n" +
                "    \"MLAMP\",\n" +
                "    \"MLAWC\",\n" +
                "    \"MLAAM\",\n" +
                "    \"MLABC\",\n" +
                "    \"MLACD\",\n" +
                "    \"MLAOT\",\n" +
                "    \"MLADC\",\n" +
                "    \"MLAMO\",\n" +
                "    \"MLAWT\",\n" +
                "    \"MLAMC\",\n" +
                "    \"MLAMS\",\n" +
                "    \"MLAVS\",\n" +
                "    \"MLATB\",\n" +
                "    \"MLAVE\"\n" +
                "  ],\n" +
                "  \"settings\": {\n" +
                "    \"identification_types\": [\n" +
                "      \"DNI\",\n" +
                "      \"Otro\"\n" +
                "    ],\n" +
                "    \"taxpayer_types\": [\n" +
                "      \"IVA Exento\",\n" +
                "      \"IVA Responsable Inscripto\",\n" +
                "      \"Monotributo\",\n" +
                "      \"Consumidor Final\"\n" +
                "    ],\n" +
                "    \"identification_types_rules\": [\n" +
                "      {\n" +
                "        \"identification_type\": \"DNI\",\n" +
                "        \"rules\": [\n" +
                "          {\n" +
                "            \"enabled_taxpayer_types\": [\n" +
                "              \"Consumidor Final\"\n" +
                "            ],\n" +
                "            \"begins_with\": \"\",\n" +
                "            \"type\": \"number\",\n" +
                "            \"min_length\": 8,\n" +
                "            \"max_length\": 8\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"identification_type\": \"Otro\",\n" +
                "        \"rules\": [\n" +
                "          {\n" +
                "            \"enabled_taxpayer_types\": [\n" +
                "              \"IVA Exento\",\n" +
                "              \"IVA Responsable Inscripto\",\n" +
                "              \"Monotributo\"\n" +
                "            ],\n" +
                "            \"begins_with\": \"\",\n" +
                "            \"type\": \"number\",\n" +
                "            \"min_length\": 11,\n" +
                "            \"max_length\": 11\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"currencies\": [\n" +
                "    {\n" +
                "      \"id\": \"USD\",\n" +
                "      \"symbol\": \"U$S\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"ARS\",\n" +
                "      \"symbol\": \"$\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"categories\": [\n" +
                "    {\n" +
                "      \"id\": \"MLA5725\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1403\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1071\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1367\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1368\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1743\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1384\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1246\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1039\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1051\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1798\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1648\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1144\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1276\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA5726\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA2547\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA407134\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1574\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1499\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1459\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1182\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA3937\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1132\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA3025\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1168\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1430\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA409431\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1540\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1953\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
