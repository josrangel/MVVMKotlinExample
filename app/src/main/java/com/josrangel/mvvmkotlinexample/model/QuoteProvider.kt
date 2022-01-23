package com.josrangel.mvvmkotlinexample.model

class QuoteProvider {
    companion object {
        fun random(): Quote {
            val position = (0..10).random()
            return quotes[position]
        }
        private val quotes = listOf(
            Quote(
                quote = "It’s not a bug. It’s an undocumented feature!",
                author = "Anonymous"
            ),
            Quote(
                quote = "“Software Developer” – An organism that turns caffeine into software",
                author = "Anonymous"
            ),
            Quote(
                quote = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                author = "Edsger Dijkstra"
            ),
            Quote(
                quote = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                author = "Anonymous"
            ),
            Quote(
                quote = "I don’t care if it works on your machine! We are not shipping your machine!",
                author = "Vidiu Platon"
            ),
            Quote(
                quote = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                author = "Bill Gates"
            ),
            Quote(
                quote = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                author = "Anonymous"
            ),
            Quote(quote = "Things aren’t always #000000 and #FFFFFF", author = "Anonymous"),
            Quote(quote = "Talk is cheap. Show me the code.", author = "Linus Torvalds"),
            Quote(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            Quote(quote = "alaska wuamas", author = "Me")
        )
    }
}