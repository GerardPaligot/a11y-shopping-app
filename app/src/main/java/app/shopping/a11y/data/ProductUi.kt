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
        val fakes = arrayListOf(
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
    }
}
