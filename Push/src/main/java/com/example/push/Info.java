package com.example.push;

import java.util.List;

public class Info {
    private List<assortment_groups> assortment_groups;

    @Override
    public String toString() {
        return
                "assortment_groups=" + assortment_groups +
                '}';
    }

    private class assortment_groups {
        private List<family_groups> family_groups;

        @Override
        public String toString() {
            return "assortment_groups{" +
                    "family_groups=" + family_groups +
                    '}';
        }

        private class family_groups {
            private List<parts> parts;

            @Override
            public String toString() {
                return "family_groups{" +
                        "parts=" + parts +
                        '}';
            }

            private class parts {
                private String id;
                private String part_id;
                private String name;
                private String number;

                @Override
                public String toString() {
                    return "parts{" +
                            "id='" + id + '\'' +
                            ", part_id='" + part_id + '\'' +
                            ", name='" + name + '\'' +
                            ", number='" + number + '\'' +
                            '}';
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPart_id() {
                    return part_id;
                }

                public void setPart_id(String part_id) {
                    this.part_id = part_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }
            }
        }
    }
}
