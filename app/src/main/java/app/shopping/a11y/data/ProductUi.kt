package app.shopping.a11y.data

data class ProductUi(
    val id: String,
    val url: String,
    val name: String,
    val rating: Float,
    val nbComments: Int,
    val quantity: Int,
    val maxQuantity: Int,
    val price: String,
    val priceStrikeout: String?
) {
    companion object {
        private val english = arrayListOf(
            ProductUi(
                id = "3168930003632",
                url = "https://target.scene7.com/is/image/Target/GUEST_d59b1f25-9c9d-4501-a5ec-9c1be36b84f2?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Tri-color Rotini - 12oz - Good & Gather",
                rating = 5f,
                nbComments = 275,
                quantity = 0,
                maxQuantity = 5,
                price = "0,95",
                priceStrikeout = null
            ),
            ProductUi(
                id = "5902884463139",
                url = "https://target.scene7.com/is/image/Target/GUEST_d2e9676b-78ec-40af-b283-1d2e8ed8aac9?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Barilla Ditalini Pasta - 16oz",
                rating = 5f,
                nbComments = 43,
                quantity = 0,
                maxQuantity = 5,
                price = "1,89",
                priceStrikeout = null
            ),
            ProductUi(
                id = "7613035144699",
                url = "https://target.scene7.com/is/image/Target/GUEST_7b9ec8ab-04e3-4cb0-8fb9-5b5acd51a755?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Barilla Spaghetti - 1lbs",
                rating = 5f,
                nbComments = 426,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "2,99"
            ),
            ProductUi(
                id = "4008713756661",
                url = "https://target.scene7.com/is/image/Target/GUEST_1a308868-3f68-45c7-b3b1-255ac34eb60a?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Gluten Free Chickpea Spaghetti - 8oz - Good & Gather™",
                rating = 3.9f,
                nbComments = 88,
                quantity = 0,
                maxQuantity = 5,
                price = "2,79",
                priceStrikeout = "2,99"
            ),
            ProductUi(
                id = "20003166",
                url = "https://target.scene7.com/is/image/Target/GUEST_93c5c93a-7c95-4557-bdb0-e9cff5534f6e?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Fettuccine - 16oz - Good & Gather™",
                rating = 4.8f,
                nbComments = 349,
                quantity = 0,
                maxQuantity = 5,
                price = "0,95",
                priceStrikeout = "1,95"
            ),
            ProductUi(
                id = "5010477354051",
                url = "https://target.scene7.com/is/image/Target/GUEST_78eac296-1124-4dab-bfc1-bd0401d53ead?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Barilla Gluten Free Chickpea Rotini - 8.8oz",
                rating = 4.1f,
                nbComments = 2313,
                quantity = 0,
                maxQuantity = 5,
                price = "3,69",
                priceStrikeout = null
            ),
            ProductUi(
                id = "3229820116716",
                url = "https://target.scene7.com/is/image/Target/GUEST_c38a90ed-1d60-476d-95c0-16fd9f8d801d?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Signature Trofie - 16oz - Good & Gather™",
                rating = 4.3f,
                nbComments = 18,
                quantity = 0,
                maxQuantity = 5,
                price = "3,69",
                priceStrikeout = null
            ),
            ProductUi(
                id = "3229820129488",
                url = "https://target.scene7.com/is/image/Target/GUEST_651b41ab-e159-434d-b787-93d463670fa4?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Pace Chunky Salsa Mild 16oz",
                rating = 5f,
                nbComments = 53,
                quantity = 0,
                maxQuantity = 10,
                price = "2,59",
                priceStrikeout = null
            ),
            ProductUi(
                id = "5010477348678",
                url = "https://target.scene7.com/is/image/Target/GUEST_cb9f5fdb-bc4c-440b-b3ca-13197bb7ac30?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Bertolli Alfredo Sauce with Aged Parmesan Cheese - 15oz",
                rating = 4.8f,
                nbComments = 344,
                quantity = 0,
                maxQuantity = 5,
                price = "2,69",
                priceStrikeout = null
            ),
            ProductUi(
                id = "3229820019307",
                url = "https://target.scene7.com/is/image/Target/GUEST_c2f8a46d-b31d-4cdb-a1b4-802396367a62?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Bertolli Organic Traditional Olive Oil, Basil & Garlic Pasta Sauce - 24oz",
                rating = 4.8f,
                nbComments = 273,
                quantity = 0,
                maxQuantity = 5,
                price = "3,89",
                priceStrikeout = "4,51"
            ),
            ProductUi(
                id = "3229820782560",
                url = "https://target.scene7.com/is/image/Target/GUEST_be8c5f3c-8aec-44ad-b839-aa59efb7f1ba?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Bertolli Vodka Pasta Sauce - 24oz",
                rating = 4.1f,
                nbComments = 409,
                quantity = 0,
                maxQuantity = 5,
                price = "2,49",
                priceStrikeout = null
            ),
            ProductUi(
                id = "5010029220773",
                url = "https://target.scene7.com/is/image/Target/GUEST_6ae78fd3-bfd4-44e9-bcde-ff5fc749bcc9?wid=325&hei=325&qlt=80&fmt=pjpeg",
                name = "Bertolli Olive Oil & Garlic Pasta Sauce - 24oz",
                rating = 5f,
                nbComments = 261,
                quantity = 0,
                maxQuantity = 5,
                price = "2,49",
                priceStrikeout = "3,59"
            ),
        )
        private val french = arrayListOf(
            ProductUi(
                id = "3229820129488",
                url = "https://images.openfoodfacts.org/images/products/322/982/012/9488/front_fr.191.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 1,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010477348678",
                url = "https://images.openfoodfacts.org/images/products/501/047/734/8678/front_fr.198.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 4.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 9,
                price = "4,99",
                priceStrikeout = null
            ),
            ProductUi(
                id = "3229820019307",
                url = "https://images.openfoodfacts.org/images/products/322/982/001/9307/front_fr.194.400.jpg",
                name = "Flocon d'avoine",
                rating = 2.4f,
                nbComments = 4,
                quantity = 0,
                maxQuantity = 5,
                price = "3,99",
                priceStrikeout = null
            ),
            ProductUi(
                id = "3229820782560",
                url = "https://images.openfoodfacts.org/images/products/322/982/078/2560/front_fr.131.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 4.8f,
                nbComments = 42,
                quantity = 0,
                maxQuantity = 5,
                price = "2,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010029220773",
                url = "https://images.openfoodfacts.org/images/products/501/002/922/0773/front_fr.127.400.jpg",
                name = "Multi-céréales soufflées ou extrudées, enrichies en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "4008713756661",
                url = "https://images.openfoodfacts.org/images/products/400/871/375/6661/front.3.400.jpg",
                name = "Flocon d'avoine",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "20003166",
                url = "https://images.openfoodfacts.org/images/products/20003166/front_fr.263.400.jpg",
                name = "Flocon d'avoine",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010477354051",
                url = "https://images.openfoodfacts.org/images/products/501/047/735/4051/front_fr.93.400.jpg",
                name = "Muesli floconneux ou de type traditionnel",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3229820116716",
                url = "https://images.openfoodfacts.org/images/products/322/982/011/6716/front_fr.152.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "7613035144699",
                url = "https://images.openfoodfacts.org/images/products/761/303/514/4699/front_fr.127.400.jpg",
                name = "Multi-céréales soufflées ou extrudées, enrichies en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5902884463139",
                url = "https://images.openfoodfacts.org/images/products/590/288/446/3139/front_fr.44.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3168930003632",
                url = "https://images.openfoodfacts.org/images/products/316/893/000/3632/front_fr.112.400.jpg",
                name = "Flocon d'avoine",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3229820794549",
                url = "https://images.openfoodfacts.org/images/products/322/982/079/4549/front_fr.69.400.jpg",
                name = "Muesli floconneux ou de type traditionnel",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3229820794556",
                url = "https://images.openfoodfacts.org/images/products/322/982/079/4556/front_fr.74.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "40897677",
                url = "https://images.openfoodfacts.org/images/products/40897677/front_fr.81.400.jpg",
                name = "Flocon d'avoine",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "7613036668910",
                url = "https://images.openfoodfacts.org/images/products/761/303/666/8910/front_fr.101.400.jpg",
                name = "Multi-céréales soufflées ou extrudées, enrichies en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3229820796451",
                url = "https://images.openfoodfacts.org/images/products/322/982/079/6451/front_fr.52.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010477356277",
                url = "https://images.openfoodfacts.org/images/products/501/047/735/6277/front_fr.46.400.jpg",
                name = "Muesli floconneux ou de type traditionnel",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010477357335",
                url = "https://images.openfoodfacts.org/images/products/501/047/735/7335/front_fr.61.400.jpg",
                name = "Muesli floconneux ou de type traditionnel",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3421557910203",
                url = "https://images.openfoodfacts.org/images/products/342/155/791/0203/front_fr.70.400.jpg",
                name = "Flocon d'avoine",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "3270190136835",
                url = "https://images.openfoodfacts.org/images/products/327/019/013/6835/front_fr.143.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "20621469",
                url = "https://images.openfoodfacts.org/images/products/20621469/front_fr.98.400.jpg",
                name = "Multi-céréales soufflées ou extrudées, enrichies en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010029201246",
                url = "https://images.openfoodfacts.org/images/products/501/002/920/1246/front_fr.117.400.jpg",
                name = "Muesli croustillant aux fruits ou fruits secs, enrichi en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            ),
            ProductUi(
                id = "5010029000061",
                url = "https://images.openfoodfacts.org/images/products/501/002/900/0061/front_en.77.400.jpg",
                name = "Multi-céréales soufflées ou extrudées, enrichies en vitamines et minéraux",
                rating = 3.4f,
                nbComments = 10,
                quantity = 0,
                maxQuantity = 5,
                price = "1,99",
                priceStrikeout = "3,99"
            )
        )
        val fake = english
    }
}
