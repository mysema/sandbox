include Java

class CatsController < ApplicationController
  def initialize
    @cat_service = $INJECTOR.get_instance(com.mysema.CatService.java_class)
  end

  def index
    @cats = @cat_service.all
  end
end
