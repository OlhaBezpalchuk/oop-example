class Rotor
  attr_accessor :name
  attr_reader :speed

  def initialize(name)
    @speed = 0
    @name = name
  end

  def speed_up
    @speed += SPEED_STEP if @speed < MAX_SPEED_CONST
  end

  def speed_down
    @speed -= SPEED_STEP if @speed > MIN_SPEED_CONST + SPEED_STEP
  end

  def stop
    @speed = MIN_SPEED_CONST
  end

  def to_string
    puts "Rotor #{@name} moving with speed #{@speed}."
  end

  private

  MIN_SPEED_CONST = 0
  MAX_SPEED_CONST = 110
  SPEED_STEP = 10

end
