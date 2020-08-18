<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

 
<div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">GESTIONS DES CLIENTS</h1>
           
            <a href="#"  data-toggle="modal" data-target="#ClientModal" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Ajouter un client </a>
          </div>

<div class="card mb-4 py-3 border-left-primary">
                <div class="card-body">
                  <div class="row">


                </div>
                  <!-- DataTales Example -->
                  <div class="card shadow mb-4">
                    <div class="card-header py-3">

                    </div>
                    <div class="card-body">
                      <div class="table-responsive">
                        <p>
                          </p><h4 class="alert-success">
                                               </h4>
                       <p></p>
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                          <thead>
                            <tr>
                              <th></th>
                              <th>Nom</th>
                              <th>Prenoms</th>
                              <th>Numéro </th>
                             
                              <th>Action</th>
                            </tr>
                          </thead>

                          <tbody>
                          
                          <c:forEach var="client" items="${clients}" varStatus="i">
                            
                              <tr class="gradeC">
                                  <td>${i.index + 1} </td>
                                  <td>${client.nom}</td>
                                  <td>${client.prenom} </td>
                                  <td>${client.num_cin } </td>
                                 
                                   
    


                              <td  style="height: 80px; width: 80px;">

                                    <a href="#"  data-toggle="modal" data-target="#ModifierClientModal"  class="edit btn btn-block btn btn-primary btn-sm " data-toggle="modal" data-target="#ModifierClientModal" >  <i class="fas  fa-pen"></i></a>
                                   
                                    <a  href="#"  data-toggle="modal" data-target="#DeleteclientModal"  class="delete btn btn-block btn btn-danger btn-sm"><i class="fas  fa-trash"></i></a>
                                                    
										<input type="hidden"  id="id" value="${client.id}">
                             </td>
                            </tr>

                            
 					</c:forEach>

                          </tbody>
                        </table>
                      </div>
                    </div>
                  </div>
                </div>
              </div>

<div class="modal fade" id="ClientModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel1" style="display: none;" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
       <form  method ="POST"  action="${pageContext.request.contextPath }/client/create" >
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel1">AJOUTER UN CLIENT</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">x</span>
          </button>
        </div>
    
        <div class="modal-body">

			  <div class="form-group">
			    <label for="exampleInputEmail1">Nom</label>
			    <input type="text" class="form-control" name ="nom" required>
			
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Prenom</label>
			    <input type="text" class="form-control"  name ="prenom" required>
			  </div>
			  
			    <div class="form-group">
			    <label for="exampleInputPassword1">Numéro </label>
			    <input type="text" class="form-control"  name="num" required>
			  </div>
			
			 </div>
			        <div class="modal-footer">
			          <button class="btn btn-secondary" type="button" data-dismiss="modal">Annuler</button>
			          <button type="submit" class="btn btn-primary">Ajouter </button>
			        </div>
        
    
		</form>
      </div>
    </div>
  </div>
  
  
  <div class="modal fade" id="ModifierClientModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel1" style="display: none;" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
       <form  method ="POST"  action="${pageContext.request.contextPath }/client/update" >
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel1">MODIFIER UN CLIENT</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">x</span>
          </button>
        </div>
    
        <div class="modal-body">

			  <div class="form-group">
			    <label for="exampleInputEmail1">Nom</label>
			    <input type="text" class="form-control" name ="nom" id ="nom" required>
			
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Prenom</label>
			    <input type="text" class="form-control"  name ="prenom" id ="prenom" required>
			  </div>
			  
			    <div class="form-group">
			    <label for="exampleInputPassword1">Numéro</label>
			    <input type="text" class="form-control"  name="num" id ="num" required>
			  </div>
			
			 </div>
			        <div class="modal-footer">
			          <button class="btn btn-secondary" type="button" data-dismiss="modal">Annuler</button>
			          <button type="submit" class="btn btn-primary">Modifier </button>
			           <input type="hidden" id="id" name ="id" >
			        </div>
        
    
		</form>
      </div>
    </div>
  </div>
  
 <div class="modal fade" id="DeleteclientModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
       <form  method ="post"  action="${pageContext.request.contextPath }/client/delete" >
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">SUPPRIMER UN CLIENT</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">x</span>
          </button>
        </div>
        <div class="modal-body">Sélectionnez «Supprimer» ci-dessous si vous êtes prêt à  supprimer le client .</div>
        <div class="modal-footer">
        
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Annuler</button>
          <input type="submit" class="btn btn-danger" value="Supprimer"> 
         <input type="hidden" id="id" name ="id" >  
         
          
        </div>
      </div>
      
      </form>
    </div>
  </div>
  