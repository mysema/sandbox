#Dir.entries("#{RAILS_ROOT}/../porthos/target/dependency").sort.each do |entry|
Dir["#{RAILS_ROOT}/../porthos/target/dependency/*.jar"].each do |entry|
    puts "About to require #{entry}"
  #if entry =~ /.jar$/
    require entry
  #end
end

include Java

#Using the classes also
$CLASSPATH << "#{RAILS_ROOT}/../porthos/target/classes"


$INJECTOR = com.mysema.ServiceModule.new.injector
