window.onload = function() {
   $(".item__check-btn").click((e) => {
      var btn = $(e.currentTarget);
      var postId = btn.attr("data-post-id");
      $.post("/product/" + postId + "/status");
      var elem = btn.attr("data-post-id");
      $(document.getElementById(elem).style.backgroundColor == 'white' ?
      $(document.getElementById(elem).style.backgroundColor='lightgreen') :
      $(document.getElementById(elem).style.backgroundColor='white'));
   });

   $(".item__delete-btn").click((e) => {
         var btn = $(e.currentTarget);
         var postId = btn.attr("data-post-id");
         alert(postId);
         $.post("/product/" + postId + "/delete");
         $("#"+ postId + "-item").remove();
   });
   }
