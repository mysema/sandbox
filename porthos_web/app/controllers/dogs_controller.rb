include Java

class DogsController < ApplicationController
  def initialize
    @dog_service = $INJECTOR.get_instance(com.mysema.DogService.java_class)
  end

  def index
    @dogs = @dog_service.find_many('fido')
  end
end
