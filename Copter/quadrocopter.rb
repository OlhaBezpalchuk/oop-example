require './rotor.rb'

class Quadrocopter

  def initialize
    @rotor = {a: Rotor.new('A'),
              b: Rotor.new('B'),
              c: Rotor.new('C'),
              d: Rotor.new('D')}
  end

  def move(direction)
    check_speed
    case direction
      when :up
        @rotor.values.each { |rotor| rotor.speed_up }
      when :down
        @rotor.values.each { |rotor| rotor.speed_down }
      when :forward
        @rotor[:a].speed_down
        @rotor[:b].speed_down
        @rotor[:c].speed_up
        @rotor[:d].speed_up
      when :back
        @rotor[:a].speed_up
        @rotor[:b].speed_up
        @rotor[:c].speed_down
        @rotor[:d].speed_down
      when :right
        @rotor[:a].speed_down
        @rotor[:b].speed_up
        @rotor[:c].speed_down
        @rotor[:d].speed_up
      when :left
        @rotor[:a].speed_up
        @rotor[:b].speed_down
        @rotor[:c].speed_up
        @rotor[:d].speed_down
    else
      puts 'Wrong direction.'
      return
    end

    puts "Quadrocopter moving #{direction}."
  end

  def stop
    @rotor.values.each {|rotor| rotor.stop}
    puts '...stopping!..'
  end

  private

  def check_speed
    puts '...standing...' if @rotor.values.any? { |rotor| rotor.speed == 0 }
  end

end
