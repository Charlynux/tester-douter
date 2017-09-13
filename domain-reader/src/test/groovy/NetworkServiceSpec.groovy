import com.iteracode.services.NetworkService
import spock.lang.Specification

class NetworkServiceSpec extends Specification {
  def "extract domain from url"() {
    setup:
    def service = new NetworkService()

    expect:
    service.getDomain(url) == domain

    where:
    url                                | domain
    "http://www.latechamienoise.com"   | "latechamienoise.com"
    "https://www.youtube.com"          | "youtube.com"
    "http://localhost"                 | "localhost"
  }
}  