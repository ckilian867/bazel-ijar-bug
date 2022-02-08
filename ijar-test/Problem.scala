import org.scalactic.Requirements._

final class Problem private (val problem: Set[String]) {
  requireNonNull(problem)
}
