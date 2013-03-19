To use the archetype, 

    # Choose a project name
    read -p "Project name: " PROJECT
    # Clone this template
    git clone https://github.com/archetypes/java.git "$PROJECT" --origin archetype
    cd "$PROJECT"
    # Set the project properties (edit properties.yaml)
    ${EDITOR:=nano} properties.yaml
    # Initialize the template
    ./init.rb
