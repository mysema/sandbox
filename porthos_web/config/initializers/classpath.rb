Dir.entries("#{RAILS_ROOT}/lib").sort.each do |entry|
  if entry =~ /.jar$/
    require entry
  end
end

include Java

$INJECTOR = com.mysema.ServiceModule.new.injector
