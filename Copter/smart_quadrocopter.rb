require './rotor.rb'
require './quadrocopter.rb'

class SmartQuadrocopter < Quadrocopter
  attr_reader :directions

  def initialize
    super
    @directions = []
    @reverse_direction = {
        up: :down,
        down: :up,
        left: :right,
        right: :left,
        forward: :back,
        back: :forward
    }

  end

  def move(direction)
    super(direction)
    @directions << direction
  end

  def stop
    super
    puts 'Current route:'
    puts @directions
  end

  def come_back
    method(:move).super_method.call(:up)
    @directions.reverse.each do |direction|
      self.move(@reverse_direction[direction])
    end
    self.stop
  end

end
