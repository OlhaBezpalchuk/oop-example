require './quadrocopter.rb'
require './smart_quadrocopter.rb'

quadrocopter = Quadrocopter.new
smart_quadrocopter = SmartQuadrocopter.new
puts '------------------------------------'
quadrocopter.move(:up)
quadrocopter.move(:forward)
quadrocopter.move(:right)
quadrocopter.move(:left)
quadrocopter.stop
puts '------------------------------------'
smart_quadrocopter.move(:up)
smart_quadrocopter.move(:forward)
smart_quadrocopter.move(:right)
smart_quadrocopter.move(:left)
smart_quadrocopter.stop
puts '------------------------------------'
puts smart_quadrocopter.directions
puts '------------------------------------'
smart_quadrocopter.come_back
